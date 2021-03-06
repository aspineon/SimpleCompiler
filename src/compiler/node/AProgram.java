/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiler.node;

import compiler.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private TWords _firstvalue_;
    private TOperation _firstoperation_;
    private TWords _secondvalue_;
    private TOperation _secondoperation_;
    private TWords _thirdvalue_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") TWords _firstvalue_,
        @SuppressWarnings("hiding") TOperation _firstoperation_,
        @SuppressWarnings("hiding") TWords _secondvalue_,
        @SuppressWarnings("hiding") TOperation _secondoperation_,
        @SuppressWarnings("hiding") TWords _thirdvalue_)
    {
        // Constructor
        setFirstvalue(_firstvalue_);

        setFirstoperation(_firstoperation_);

        setSecondvalue(_secondvalue_);

        setSecondoperation(_secondoperation_);

        setThirdvalue(_thirdvalue_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneNode(this._firstvalue_),
            cloneNode(this._firstoperation_),
            cloneNode(this._secondvalue_),
            cloneNode(this._secondoperation_),
            cloneNode(this._thirdvalue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public TWords getFirstvalue()
    {
        return this._firstvalue_;
    }

    public void setFirstvalue(TWords node)
    {
        if(this._firstvalue_ != null)
        {
            this._firstvalue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._firstvalue_ = node;
    }

    public TOperation getFirstoperation()
    {
        return this._firstoperation_;
    }

    public void setFirstoperation(TOperation node)
    {
        if(this._firstoperation_ != null)
        {
            this._firstoperation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._firstoperation_ = node;
    }

    public TWords getSecondvalue()
    {
        return this._secondvalue_;
    }

    public void setSecondvalue(TWords node)
    {
        if(this._secondvalue_ != null)
        {
            this._secondvalue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._secondvalue_ = node;
    }

    public TOperation getSecondoperation()
    {
        return this._secondoperation_;
    }

    public void setSecondoperation(TOperation node)
    {
        if(this._secondoperation_ != null)
        {
            this._secondoperation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._secondoperation_ = node;
    }

    public TWords getThirdvalue()
    {
        return this._thirdvalue_;
    }

    public void setThirdvalue(TWords node)
    {
        if(this._thirdvalue_ != null)
        {
            this._thirdvalue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._thirdvalue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._firstvalue_)
            + toString(this._firstoperation_)
            + toString(this._secondvalue_)
            + toString(this._secondoperation_)
            + toString(this._thirdvalue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._firstvalue_ == child)
        {
            this._firstvalue_ = null;
            return;
        }

        if(this._firstoperation_ == child)
        {
            this._firstoperation_ = null;
            return;
        }

        if(this._secondvalue_ == child)
        {
            this._secondvalue_ = null;
            return;
        }

        if(this._secondoperation_ == child)
        {
            this._secondoperation_ = null;
            return;
        }

        if(this._thirdvalue_ == child)
        {
            this._thirdvalue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._firstvalue_ == oldChild)
        {
            setFirstvalue((TWords) newChild);
            return;
        }

        if(this._firstoperation_ == oldChild)
        {
            setFirstoperation((TOperation) newChild);
            return;
        }

        if(this._secondvalue_ == oldChild)
        {
            setSecondvalue((TWords) newChild);
            return;
        }

        if(this._secondoperation_ == oldChild)
        {
            setSecondoperation((TOperation) newChild);
            return;
        }

        if(this._thirdvalue_ == oldChild)
        {
            setThirdvalue((TWords) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
